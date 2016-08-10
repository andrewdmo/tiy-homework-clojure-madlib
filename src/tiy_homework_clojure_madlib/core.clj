(ns tiy-homework-clojure-madlib.core)


  (defn mad-lib
     [adj0 adj1 adj2 adj3 adv0 adv1 vrb noun0 noun1 nouns
      room liquod pet name anml excl bdyprt vrbing0 vrbing1
      number]
     (str "Since I use my computer every day, it can get " adj0 " really "
          adv0 ".  I always\nmake sure to " vrb " it every " number
          " days in order to keep it shiny and " adj1 ".  I'll\ngrab a soft "
          noun0 " from the " room " and " adv1 " wipe the keyboard down to "
          "get\nrid of all the " nouns ".  Then I squirt some " liquod " on the screen to get it nice \nand " adj2 ".  This week, it was "
          "extra dirty because my little " pet " \n" name " decided to bring "
          "a dead " anml " into my room and eat it at\nmy desk.  When I "
          "yelled " excl "! and told him to stop, he stuck out his\n" bdyprt
          " at me and continued " vrbing0 ".  Then he started " vrbing1
          " so hard\nthat he spilled all of his " anml"s all over my "
          noun1 ".  That is the last\ntime I'll let my " adj3 " little pet "
          "in my room ever again!"))

(defn -main []

  (println
      (mad-lib "hot" "smelly" "rusty" "prickly" "morbidly" "fearfully"
               "type" "bus" "tree" "primaries" "pantry" "bleach"
               "skink" "Eugene" "walrus" "dang" "toe" "stretching" "reading"
               "1013"))
  ;; ghost indentation around screen but F it
  ;; no more than 20 parameters!! (mention)
  ;; try to add inputs later
  )

(-main)