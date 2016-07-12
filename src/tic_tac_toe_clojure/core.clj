(ns tic-tac-toe-clojure.core
  (:gen-class))

(def board [[:x :e :o] 
            [:x :e :e]
            [:x :e :o]])

(defn -main []
  (let [[[a b c]
         [d e f]
         [g h i]] board
        solutions (hash-set
                    [a b c]
                    [d e f]
                    [g h i]
                    [a d g]
                    [b e h]
                    [c f i]
                    [a e i]
                    [c e g])]
     (cond
        (contains? solutions [:x :x :x]) :x
        (contains? solutions [:o :o :o]) :o
         :else nil)))
    
  
