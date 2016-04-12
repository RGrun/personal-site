(ns personal-site.routes.projects
  (:require [compojure.core :refer :all]
            [personal-site.views.layout :as layout]))

(defn malbum-page []
      (layout/render "malbum.html" {:title "Malbum <~> Projects <~> Richard Grunert"}))

(defn lunar-invasion-page []
      (layout/render "invasion.html" {:title "Lunar Invasion <~> Projects <~> Richard Grunert"}))

(defn adc-page []
      (layout/render "adc.html" {:title "Accident Data Center <~> Projects <~> Richard Grunert"}))

(defn other-sites-page []
      (layout/render "other-sites.html" {:title "Other Sites <~> Projects <~> Richard Grunert"}))

(defn athena-page []
      (layout/render "athena.html" {:title "Athena <~> Projects <~> Richard Grunert"}))

(defroutes project-routes
    (GET "/projects/lunar-invasion" [] (lunar-invasion-page))
;    (GET "/projects/malbum" [] (malbum-page))
    (GET "/projects/adc" [] (adc-page))
    (GET "/projects/other-sites" [] (other-sites-page))
    (GET "/projects/athena" [] (athena-page))
    )
