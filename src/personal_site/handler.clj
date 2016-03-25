(ns personal-site.handler
  (:require [compojure.core :refer [defroutes routes]]
            [ring.middleware.resource :refer [wrap-resource]]
            [ring.middleware.file-info :refer [wrap-file-info]]
            [hiccup.middleware :refer [wrap-base-url]]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [personal-site.routes.home :refer [home-routes]]
            [personal-site.routes.projects :refer [project-routes]]))

(defn init []
  (println "personal-site is starting"))

(defn destroy []
  (println "personal-site is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes home-routes project-routes app-routes)
      (handler/site)
      (wrap-resource "public")
      (wrap-base-url)))
