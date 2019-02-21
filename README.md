# APP
android studio插件运用
本DEMO里面主要包括ButterKnife，Android code Generetor,Gsonformat插件的运用，build.gradle里面代码混淆的开启，proguard-rules.pro代码混淆的配置，Serializable有序化的传递。
ButterKnife需要在内部build.gradle配置apply plugin: 'com.jakewharton.butterknife'
    implementation 'com.jakewharton:butterknife:8.8.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
    在外部build.gradle配置classpath 'com.jakewharton:butterknife-gradle-plugin:9.0.0-rc1'
