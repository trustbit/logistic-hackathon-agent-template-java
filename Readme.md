<p align="center">
  <a href="https://www.bitmovin.com">
    <img alt="Trustbit Hackathon: Sustainable Logistics Simulation" src="images/header.jpeg" >
  </a>

  <h4 align="center">This is the <b>Java</b> agent template repository for the <br><a href="https://trustbit.tech/hackathon" target="_blank">Trustbit Hackathon: Sustainable Logistics Simulation</a> which you can use to get started quickly.</h4>

  <p align="center">
    <a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="License"></img></a>
        <a href="https://trustbit.tech"><img src="https://img.shields.io/badge/Organizer-Trustbit-%23006871" alt="Join Slack chat"></img></a>
    <a href="https://join.slack.com/t/trustbitsusta-vl26615/shared_invite/zt-17i36qlc1-h6L0GsJov2gPLLSYFaqNmw"><img src="https://img.shields.io/badge/Slack-join%20chat-green" alt="Join Slack chat"></img></a>
  </p>
</p>

**For a detailed explanation of how to make a copy of this repository and get it into the competition build system, please visit [Agent template repositories and comeptition build system](https://github.com/trustbit/logistic-hackathon-public#3-create-a-new-ssh-key-for-the-competition-build-system). All questions about the simulation and its rules are answered under [Simulation](https://github.com/trustbit/logistic-hackathon-public#simulation).**

## Prerequisites
- **IDE** - We strongly advise you to use an IDE which will help you to edit, compile and run Java code. Our recommendation is IntelliJ IDEA, which you can download for free at: https://www.jetbrains.com/idea/download
- **JDK 17** - You will need a distribution of JDK 17 on your machine. Our recommendation is the Adoptium project, which you can download for free at: https://adoptium.net/

## Where should I add the logic of my truck agent?
- Open the project in your favorite IDE and browse to [src/main/java/com/trustbit/truckagent/TruckAgentController.java](src/main/java/com/trustbit/truckagent/TruckAgentController.java)
- The method `decide` will always be called by the simulation when the next decision is needed from your truck agent. The argument of this method contains all the information you need to decide for the next move. Just return an instance of [DecideRequest](src/main/java/com/trustbit/truckagent/model/DecideRequest.java) and the simulation will take over again.

## How can I test my truck agent?
- Open the project in your favorite IDE and browse to [src/test/java/com/trustbit/truckagent/TruckAgentControllerTests.java](src/test/java/com/trustbit/truckagent/TruckAgentControllerTests.java)
- This is an integration test which will start your agent and will call the `decide` method with the contents of file [src/test/resources/decide.json](src/test/resources/decide.json)
- You can always change the `decide.json` file and debug your script.

## How can I run the truck agent or its tests without an IDE?
- `./gradlew clean bootRun` will start the truck agent, which will then service requests on port 8080.
- `./gradlew clean test` will execute all the tests in the project.
