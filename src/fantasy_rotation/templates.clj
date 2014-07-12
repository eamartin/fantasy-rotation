(ns fantasy-rotation.templates
  (:require [hiccup.core :refer :all]))

(def sign-in-page
  (html [:h1 "Fantasy Rotation!"]
        [:h2 "Because you have nothing better to do"]
        [:form {:method "POST" :action "/create_or_login"}
         "Username: "
         [:input {:type "text" :name "name" :autofocus "true"}]
         [:input {:type "submit" :value "submit"}]
        ]

  )
)
