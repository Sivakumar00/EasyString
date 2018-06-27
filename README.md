# EasyString

## It is a Java library has 2 needful methods: permutate() and isValidEmail()

```
//paste at build.gradle

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Dependencies:
```
dependencies {
	        implementation 'com.github.Sivakumar00:EasyString:EasyString-1.0'
	}
```
## Method Calling - permutation of string
```
EasyString.permutation(<String>); //returns List<String> object
```
## Method Calling - Validation of Email
```
EasyString.isValidEmail(<string>); //returns boolean
```
