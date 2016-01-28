class BootStrap {
    def groovyPageLayoutFinder

    def init = { servletContext ->
        groovyPageLayoutFinder.setCacheEnabled(true)
    }
}
