(ns fantasy-rotation.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" {{name :name} :params} (str "Hi " name))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
