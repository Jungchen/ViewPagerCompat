#ViewPagerCompat

ViewPagerCompat继承自ViewPager，解决了在API 13及其以下版本中，ViewPager嵌套的时候子ViewPager不能滑动的问题

Inherited from the ViewPager, solve API 13 and the following, when the ViewPager nested child ViewPager cannot slide

![sample.gif](https://github.com/xiaopansky/ViewPagerCompat/raw/master/releases/sample.gif)

## Sample App
[Download it on Github](https://github.com/xiaopansky/ViewPagerCompat/raw/master/releases/sample-1.1.0.apk)

![download.png](https://github.com/xiaopansky/ViewPagerCompat/raw/master/releases/download.png)

##Usage Guide
####1. 导入ViewPagerCompat（Import ViewPagerCompat to your project）

#####使用Eclipse（Use Eclipse）
1. 首先点击下载[viewpagercompat-1.1.0.aar](https://github.com/xiaopansky/ViewPagerCompat/raw/master/releases/viewpagercompat-1.1.0.aar)并改后缀名为zip
2. 然后解压并将classes.jar文件重命名为viewpagercompat-1.1.0.jar
3. 最后将viewpagercompat-1.1.0.jar拷贝到你的项目的libs目录下

#####使用Gradle（Use Gradle）
**从JCenter仓库导入（From jcenter import ）**

```groovy
dependencies{
	compile 'me.xiaopan:viewpagercompat:1.1.0'
}
```

**离线模式（Offline work）**

点击下载[viewpagercompat-1.1.0.aar](https://github.com/xiaopansky/ViewPagerCompat/raw/master/releases/viewpagercompat-1.1.0.aar)并放到你module的libs目录下

然后在你module的build.gradle文件中添加以下代码：
```groovy
repositories{
    flatDir(){
        dirs 'libs'
    }
}

dependencies{
    compile(name:'viewpagercompat-1.1.0', ext:'aar')
}
```
最后同步一下Gradle即可

###2. 使用
```xml
<me.xiaopan.vpc.ViewPagerCompat
    android:id="@+id/viewPager_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

注意：
>* 只需父ViewPager使用ViewPagerCompat就可以实现ViewPager嵌套滑动
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
