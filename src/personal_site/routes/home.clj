(ns personal-site.routes.home
  (:require [compojure.core :refer :all]
            [personal-site.views.layout :as layout]))

(defn home []
  (layout/render "home.html" {:title "Richard Grunert <~> Software Developer"
                              :home true}))

(defn resume-page []
      (layout/render "resume.html" {:title "Resume <~> Richard Grunert <~> Software Developer"}))


(defroutes home-routes
  (GET "/" [] (home))
  (GET "/resume" [] (resume-page)))
