package com.uber.test;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest{

    static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException {

        openMobileApp();

    }

    public static void openMobileApp() throws MalformedURLException {
        DesiredCapabilities  cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Infinix HOT 12 Play");
        cap.setCapability("udid","084113128K051945");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("automationName","uiAutomator2");
        cap.setCapability("appPackage","com.reddit.frontpage");
        cap.setCapability("appActivity","com.reddit.launch.main.MainActivity");

//        URL url =  new URL("http://127.0.0.1:4723/");
        URL url = new URL("http://127.0.0.1:4723/");

        driver = new AppiumDriver(url, cap);

        System.out.println("application is started");

//        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new "));
    }
}




//
//export ANDROID_HOME=/home/yuva/Android/Sdk
//export PATH=$ANDROID_HOME/platform-tools:$ANDROID_HOME/tools:$PATH
//export ANDROID_SDK_ROOT=/home/yuva/Android/Sdk


