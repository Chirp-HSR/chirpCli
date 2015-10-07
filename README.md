# Chirp CLI

An example CLI client for the Chirp backend using the generated Chirp Java client.

## Setup

1. Clone this repository with `git clone https://github.com/Chirp-HSR/chirpCli.git`.
2. Make sure you published the chirp-java-client to your local Maven repository:
    1. Setup the [Chirp](https://github.com/Chirp-HSR/chirp) project
    2. Invoke code generation in the root folder of the Chirp project: `mvn compile`
    3. Navigate to the generated project in `target/generated-sources/javaClient`
    4. Publish the generated project locally: `mvn install`
3. Run chirpCli (from the chirpCli root folder): `mvn exec:java -Dexec.mainClass="chirp.client.Main"`
