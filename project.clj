(defproject cd-analyzer "0.1.0-SNAPSHOT"
  :description "FIXME: write"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.0.6"]
				 [postgresql/postgresql "9.0-801.jdbc4"]
				 [org.slf4j/slf4j-api "1.6.1"]
				 [ch.qos.logback/logback-classic "0.9.24"]
				 [clj-stacktrace"0.1.3"]
                 [hiccup "0.3.6"]]
  :source-paths ["src/" 
                 "/Users/xavriley/Projects/overtone/src" 
                 "/Users/xavriley/Projects/overtone/resources"]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"]]
  :main main)
