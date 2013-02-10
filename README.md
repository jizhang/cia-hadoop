# Clojure in Action: Write Hadoop MapReduce Job

## Usage

### src/cia-hadoop/wordcount5.clj

* Compile

    $ lein uberjar

* Run locally:

    $ java -cp target/cia-hadoop-0.1.0-SNAPSHOT-standalone.jar clojure_hadoop.job -job cia-hadoop.wordcount5/job -input README.md -output out5

* Run on a cluster:

    $ hadoop jar target/cia-hadoop-0.1.0-SNAPSHOT-standalone.jar clojure_hadoop.job -job cia-hadoop.wordcount5/job -input README.md -output out5

## License

Copyright © 2013 Ji ZHANG <zhangji87@gmail.com>

Distributed under the Eclipse Public License, the same as Clojure.
