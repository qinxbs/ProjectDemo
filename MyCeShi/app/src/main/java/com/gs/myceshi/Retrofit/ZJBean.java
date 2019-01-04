package com.gs.myceshi.Retrofit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//ElementType.TYPE：能修饰类、接口或枚举类型
//ElementType.FIELD：能修饰成员变量
//ElementType.METHOD：能修饰方法
//ElementType.PARAMETER：能修饰参数
//ElementType.CONSTRUCTOR：能修饰构造器
//ElementType.LOCAL_VARIABLE：能修饰局部变量
//ElementType.ANNOTATION_TYPE：能修饰注解
//ElementType.PACKAGE：能修饰包
@Target(ElementType.FIELD)
//RetentionPolicy.SOURCE: 只在源代码中保留 一般都是用来增加代码的理解性或者帮助代码检查之类的，比如我们的Override;
//RetentionPolicy.CLASS: 默认的选择，能把注解保留到编译后的字节码class文件中，仅仅到字节码文件中，运行时是无法得到的；
//RetentionPolicy.RUNTIME: ，注解不仅 能保留到class字节码文件中，还能在运行通过反射获取到，这也是我们最常用的。
@Retention(RetentionPolicy.SOURCE)
/**
 * 通过反射，注解获取数据 (注解使用：在某个类，方法，成员变量 直接@ZJBean)
 */
public @interface ZJBean {
 //用法
//获取类
//Class c = Class.forName(className);
////实例化一个TestClass对象
//TestClass tc= (TestClass) c.newInstance();
//
//// 获取所有的属性
//Field[] fields = c.getDeclaredFields();
//
//for (Field field : fields) {
//   if(field.isAnnotationPresent(BindPort.class)){
//         BindPort port = field.getAnnotation(BindPort.class);
//         field.setAccessible(true);
//         field.set(tc,port.value());
//   }
//
//   if (field.isAnnotationPresent(BindAddress.class)) {
//         BindAddress address = field.getAnnotation(BindAddress.class);
//         field.setAccessible(true);
//         field.set(tc,address.value());
//   }
//
//}
    ////获取类
    //Class c = Class.forName("java.lang.String");
    //// 获取所有的方法
    //Method[] ms = c.getDeclaredMethods();
    // //遍历输出所有方法
    //for (Method method : ms) {
    //   //获取方法所有参数
    //   Parameter[] parameters = method.getParameters();
    //   String params = "";
    //   if (parameters.length > 0) {
    //        StringBuffer stringBuffer = new StringBuffer();
    //        for (Parameter parameter : parameters) {
    //             stringBuffer.append(parameter.getType().getSimpleName() + " " + parameter.getName() + ",");
    //        }
    //        //去掉最后一个逗号
    //       params = stringBuffer.substring(0, stringBuffer.length() - 1);
    //}
    //System.err.println(Modifier.toString(method.getModifiers())
    //                    + " " + method.getReturnType().getSimpleName()
    //                    + " " + method.getName()
    //                    + " (" +params  + ")");
    //}
}
