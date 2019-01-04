
package com.gs.myceshi.Retrofit;

import android.annotation.SuppressLint;
import android.os.Build;

import org.apache.http.conn.ssl.SSLSocketFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;

public class SecureSocketFactory extends SSLSocketFactory {
	private SSLContext sslContext = SSLContext.getInstance("TLSv1");

	@SuppressLint("TrulyRandom")
	public SecureSocketFactory(KeyStore truststore, String keyStorePassword)
			throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
		super(truststore);
		//SSL加载自己的证书
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmf.init(truststore, keyStorePassword.toCharArray());
		//授信自己的证书
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(truststore);

		sslContext.init(kmf.getKeyManagers(),
				trustManagerFactory.getTrustManagers(), new java.security.SecureRandom());

		this.setHostnameVerifier(ALLOW_ALL_HOSTNAME_VERIFIER);
	}

	@Override
	public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException
	{
		/**
		 * Pre-ICS Android had a bug resolving HTTPS addresses. This workaround
		 * fixes that bug.
		 * 
		 * @see <a
		 *      href="https://code.google.com/p/android/issues/detail?id=13117#c14">https://code.google.com/p/android/issues/detail?id=13117#c14</a>
		 */
		if (Integer.valueOf(Build.VERSION.SDK_INT) >= 4)
		{
			try
			{
				Field field = InetAddress.class.getDeclaredField("hostName");
				field.setAccessible(true);
				field.set(socket.getInetAddress(), host);
			}
			catch (Exception ignored)
			{

			}
		}

		return patch(sslContext.getSocketFactory().createSocket(socket, host, port, autoClose));
	}

	@Override
	public Socket createSocket() throws IOException
	{
		return patch(sslContext.getSocketFactory().createSocket());
	}

	private static final String[] TLS_SUPPORT_VERSION = {"TLSv1.1", "TLSv1.2"};

	private Socket patch(Socket s) {
		if (s instanceof SSLSocket) {
			((SSLSocket) s).setEnabledProtocols(TLS_SUPPORT_VERSION);
		}
		return s;
	}

}
