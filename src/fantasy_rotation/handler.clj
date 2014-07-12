(ns fantasy-rotation.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [fantasy-rotation.templates :refer :all]))

(defroutes app-routes
  (GET "/" [] fantasy-rotation.templates/sign-in-page)
  (POST "/create_or_login" {{name :name} :params} (str name))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
