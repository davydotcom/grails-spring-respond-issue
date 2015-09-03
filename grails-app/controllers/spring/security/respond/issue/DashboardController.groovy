package spring.security.respond.issue

class DashboardController {

    def index() { 
    	respond User.list()
    }
}
