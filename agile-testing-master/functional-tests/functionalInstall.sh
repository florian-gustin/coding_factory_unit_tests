#!/bin/sh

cd /Library/Java/JUNIT/
sudo mkdir selenium
sudo wget http://selenium-release.storage.googleapis.com/3.8/selenium-server-standalone-3.8.1.jar
sudo wget http://selenium-release.storage.googleapis.com/3.8/selenium-java-3.8.1.zip
sudo unzip selenium-java-3.8.1.zip -d selenium
sudo chmod 755 selenium/libs
sudo chmod 755 selenium/libs/*
sudo wget https://chromedriver.storage.googleapis.com/2.34/chromedriver_mac64.zip
sudo unzip chromedriver_mac64.zip
sudo rm chromedriver_mac64.zip
sudo mv selenium/client-combined*.jar .
sudo mv selenium/libs/* .
sudo rm -r selenium-java-3.8.1.zip selenium/
sudo chown $USER /Library/Java/JUNIT /Library/Java/JUNIT/*
sudo chmod 755 /Library/Java/JUNIT /Library/Java/JUNIT/*
