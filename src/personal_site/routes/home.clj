(ns personal-site.routes.home
  (:require [compojure.core :refer :all]
            [personal-site.views.layout :as layout]))

(defn home []
  (layout/render "home.html" {:title "Richard Grunert <~> Software Developer"
                              :home true}))

(defroutes home-routes
  (GET "/" [] (home)))
