# CRASLY
Crasly is a very simple implementation of a **Core Java** project that allows a user to create a chat, add multiple users and converse on that chat. It doesn't have a command line interface, it's just hardcoded interactions.

## Technologies
![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk&logoColor=white)

## Prerequisites
- Java 17+
- **Optional** - An IDE such as IntelliJ, VSCode, Netbeans

## Installation (Will work on both powershell and bash/zsh terminals)
1. Clone the repository:
   ```bash
   git clone https://github.com/ZeleOeO/Crasly.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Crasly
   ```

## Usage
- Run the project on command line
   ```bash
    javac src/Main.java
    java src/Main
    ```
- You can also go to `src/Main.java` and hardcode edit or add your own chat scenario

## File Structure
```powershell
CRASLY/
│   .gitignore
├───.idea/
├───src/
│   │   Main.java
│   ├───entities/
│   │       Admin.java
│   │       Chat.java
│   │       ChatMessage.java
│   │       Reaction.java
│   │       Text.java
│   │       User.java
│   ├───exceptions/
│   └───tools/
├───tests
│   └───tools
│   │       IDGeneratorTest.java
└─── README.md
```

## Running Tests
Unfortunately didn't create tests for this project

## Steps to Contribute
1. Open an issue first so I can like keep track, but if that's too much stress that's fine too
2. Fork the Repository
3. Clone your fork
4. Create a new branch
   ```bash
   git checkout -b your-branch-name
   ```
5. Make your change
6. Commit your change, please use [Conventional Commits](https://gist.github.com/qoomon/5dfcdf8eec66a051ecd85625518cfd13) if you can, I didn't really use it here tbh
7. Push your change
8. Make a pull request and reference your issue <br>
   Please stick to conventional methods of programming java and springboot applications, don't mess up my already spaghetti code

## License
[MIT](https://choosealicense.com/licenses/mit/)
