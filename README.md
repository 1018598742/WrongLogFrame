# WrongLogFrame
Android崩溃日志工具Clog


这是一个集成将android 崩溃日志写入到sd卡得工具类的事例项目。
clog工具最低版本android2.2(8),已经适配到android7.0。
工具使用方法：
导入：Android Studio

 compile 'com.dreamlive.cn.clog:ClogLibrary:0.0.1'
 
 使用方法（事例只测试了方法一）
 
 使用方法1

***强烈建议****

使用方法1，因为不需要权限。

在application的oncreate（）配置

  //android6.0也不需要动态sd权限，
  //将错误日志写入到sd卡,默认为Android/data/包名/files/logs下面放这个目录下主要是为了不需要权限
  CollectLog clog = CollectLog.getInstance();
  clog.init(this);
  [object Object]
  //一行代码就是CollectLog.getInstance().init(this);
使用方法2

自定义日志存放路径 在application的oncreate（）配置

   //自定义日志存放路径,
   //这儿示例就只传了sd根目录下的dreamlivemeng(/storage/emulated/0/dreamlivemeng)，把错误日志写到这个目录下
  CollectLog clog = CollectLog.getInstance();
  clog.init(this, Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "dreamlivemeng");
混淆

#Clog
-dontwarn com.dreamlive.cn.**
-keep classcom.dreamlive.cn.**{*;}



工具类的说明网址：http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2016/1125/6801.html；
