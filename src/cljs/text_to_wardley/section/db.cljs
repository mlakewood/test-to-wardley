(ns text-to-wardley.section.db)

(defn data-path
  "Returns a path to text-to-wardley.section data in app db."
  ([]         [:sections-data])
  ([appendix] (flatten (conj (data-path) appendix))))

(defn db-get-data
  "Returns data for section under `section-key`."
  [db section-key]
  (get-in db (data-path section-key)))