(defproject personal-site "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [selmer "0.5.4"]
                 [korma "0.4.2"]
                 [lib-noir "0.7.6"]
                 [ring-server "0.3.1"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler personal-site.handler/app
         :init personal-site.handler/init
         :destroy personal-site.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.3.1"]]}})
