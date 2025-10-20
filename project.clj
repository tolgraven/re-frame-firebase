;;; Author: David Goldfarb (deg@degel.com)
;;; Copyright (c) 2017-8, David Goldfarb

(defproject com.degel/re-frame-firebase "0.10.0-SNAPSHOT"
  :description "A re-frame wrapper around firebase"
  :url "https://github.com/deg/re-frame-firebase"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.132"]
                 [re-frame "1.3.0"]
                 [com.degel/iron "0.4.0"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :cljsbuild {:builds {}} ; prevent https://github.com/emezeske/lein-cljsbuild/issues/413
  :plugins [[lein-npm "0.6.2"]]
  :npm {:dependencies [[source-map-support "0.5.6"]]}
  :repositories [["private" {:url "https://tolgraven.hel1.your-objectstorage.com/m2/releases/"
                             :no-auth true}]]
  :deploy-repositories [["private-local" {:url "file:.deploy-m2"
                                          :sign-releases false}]]

  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
