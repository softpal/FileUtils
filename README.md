# FileUtils


### Developed by
[Softpal](https://www.github.com/softpal)

[![](https://jitpack.io/v/softpal/FileUtils.svg)](https://jitpack.io/#softpal/FileUtils)


**Features**

This Library used to get the path of the file from storage locations by passing uri



## Installation

Add repository url and dependency in application module gradle file:
  
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
    
    
### Gradle
[![](https://jitpack.io/v/softpal/FileUtils.svg)](https://jitpack.io/#softpal/FileUtils)
```javascript
dependencies {
    implementation 'com.github.softpal:FileUtils:1.0'
}
```


## Usage

### 1. Get File Path

```javascript
       String path = FileUtils.getPath(MainActivity.this.getBaseContext(),uri);
```
