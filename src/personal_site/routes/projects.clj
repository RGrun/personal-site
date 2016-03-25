(ns personal-site.routes.projects
  (:require [compojure.core :refer :all]
            [personal-site.views.layout :as layout]))

(defn malbum-page []
  (layout/render "malbum.html" {:title "Malbum <~> Projects <~> Richard Grunert"}))

(def project-routes
  (context "/projects" []
    (GET "/malbum" [] (malbum-page))
;    (GET "/lunar-invasion" [] (lunar-invasion-page))
;    (GET "/adc" [] (adc-page))
;    (GET "/other-sites" (other-sites-page))
;    (GET "/athena" [] (athena-page))
    ))
