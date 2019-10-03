#!/bin/sh

source $HOME/.bash_profile
cd ../src
javac -d ../bin/ test/functional/FunctionalTest.java
cd ../bin
java org.junit.runner.JUnitCore test.functional.FunctionalTest