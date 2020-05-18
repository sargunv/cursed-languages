(ns me.sargunvohra.mcmods.language.clojure.example
  (:import [net.fabricmc.api ModInitializer]))

(deftype ExampleMainEntrypoint []
  ModInitializer
  (onInitialize [_] (println "Hello Fabric world from Clojure!")))
