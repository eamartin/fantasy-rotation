(ns fantasy-rotation.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [fantasy-rotation.handler :refer [app]]))

;(run-jetty app {:port 3002})
