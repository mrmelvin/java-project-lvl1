.DEFAULT_GOAL := build-run
clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

lint:
	./gradlew checkstyleMain checkstyleTest

build-run: build run

.PHONY: build
