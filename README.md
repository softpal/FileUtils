# FileUtils


### Developed by
[Softpal](https://www.github.com/softpal)

[![](https://jitpack.io/v/softpal/DateTimeUtils.svg)](https://jitpack.io/#softpal/DateTimeUtils)


**Features**

Get Path of the File by passing URI


## Installation

Add repository url and dependency in application module gradle file:
  
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
    
    
### Gradle
[![](https://jitpack.io/v/softpal/DateTimeUtils.svg)](https://jitpack.io/#softpal/DateTimeUtils)
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
