(ns me.sargunvohra.mcmods.language.clojure
  (:import (net.fabricmc.loader.api LanguageAdapter)
           (net.fabricmc.loader.util DefaultLanguageAdapter)))

(deftype ClojureAdapter []
  LanguageAdapter
  (create [_ modContainer entryPoint interface]
    (.create DefaultLanguageAdapter/INSTANCE modContainer entryPoint interface)))
