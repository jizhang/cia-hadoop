(ns cia-hadoop.core-test
  (:use clojure.test
        cia-hadoop.core
        clojure-hadoop.job
        [cia-hadoop.wordcount5 :only job]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest test-wordcount-5
         (is (run job)))
