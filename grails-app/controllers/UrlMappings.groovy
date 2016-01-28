class UrlMappings {

    static mappings = {
        "/"(view: '/index')
        "404"(controller: 'error', action: 'notFound')
        "500"(controller: 'error', action: 'serverError')
    }
}
