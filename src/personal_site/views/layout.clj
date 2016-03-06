(ns personal-site.views.layout
  (:require
    [selmer.parser :as parser]
    [ring.util.response :refer [content-type response]]
    [compojure.response :refer [Renderable]]
    [noir.session :as session]
    ))

(def template-folder "personal_site/views/templates/")

(defn utf-8-response [html]
  (content-type (response html) "text/html; charset=utf-8"))

(deftype RenderablePage [template params]
  Renderable
  (render [this request]
    (let [p (assoc params
              :context (:context request))]
      (utf-8-response (parser/render-file (str template-folder template) p)))))

(defn render [template & [params]]
  (RenderablePage. template params))
