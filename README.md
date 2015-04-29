#CompatViewPager

CompatViewPager继承自ViewPager，解决了在API 13及其以下版本中，ViewPager嵌套的时候子ViewPager不能滑动的问题

Inherited from the ViewPager, solve API 13 and the following, when the ViewPager nested child ViewPager cannot slide

![sample.gif](https://github.com/xiaopansky/CompatViewPager/raw/master/releases/sample.gif)

## Sample App
[Download it on Github](https://github.com/xiaopansky/CompatViewPager/raw/master/releases/compat-view-pager-1.0.0.apk)

![download.jpg](https://github.com/xiaopansky/CompatViewPager/raw/master/releases/download.jpg)

##Usage Guide
###Step1 导入
####Using Eclipse
点击下载 [compat-view-pager-1.0.0.jar](https://github.com/xiaopansky/CompatViewPager/raw/master/releases/compat-view-pager-1.0.0.jar) ，下载后放到libs目录下即可

####Using Android Studio
点击下载 [compat-view-pager-1.0.0.aar](https://github.com/xiaopansky/CompatViewPager/raw/master/releases/compat-view-pager-1.0.0.aar) ，下载后放到libs目录下，然后在build.gradle中添加以下代码
```java
repositories{
    flatDir(){
        dirs 'libs'
    }
}

dependencies{
	compile(name:'compat-view-pager-1.0.0', ext:'aar')
}
```
最后同步一下Gradle即可

其实CompatViewPager只有一个class文件，所以你也可以直接下载jar文件放到libs目录下，然后同步Gradle即可

###Step2 使用
```xml
<me.xiaopan.cvp.CompatViewPager
    android:id="@+id/viewPager_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

注意：
>* 只需父ViewPager使用CompatViewPager就可以实现ViewPager嵌套滑动
>* 必须使用最新版的support-v4库，因为旧版本的support-v4本身就存在兼容性问题

##License
```java
/*
* Copyright (C) 2014 Peng fei Pan <sky@xiaopan.me>
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
```
