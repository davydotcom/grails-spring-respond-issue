class UrlMappings {

    static mappings = {
        "/dashboard"(resources: 'dashboard')

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
