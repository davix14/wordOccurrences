# wordOccurrences

## User Guide
Prerequisites:

* Ensure that java is installed on your computer and all enviroment variables are set. If help is needed with this step look at [these instructions](https://www.java.com/en/download/help/path.html)

Usage:
1. Clone the repository
2. Navigate to the project directory where repository was cloned to and open a terminal window in that directory
3. Run the gradlew file and pass run command in the terminal.
   * ex: ```./gradlew run```
4. The console will print out all results

## Technical Documentation

For documentation/javadoc generation run the gradlew file and pass dokkaJavadoc command in the terminal.
* ex: ```./gradlew dokkaJavadoc```
this will generate javadoc documentation for this project within the build/dokka/javadoc directory

For distribution run the gradlew file and pass jlinkzip command in the terminal.
* ex: ```./gradlew jlinkzip```
this will generate a directory with a .sh file for bash terminals and a .bat executable for windows machines within a zip file in the build/distributions directory
