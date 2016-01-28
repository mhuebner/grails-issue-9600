package layoutresolutionerror

import org.springframework.http.HttpStatus

class ErrorController {

    def notFound() {
        render view: '/notFound', status: HttpStatus.NOT_FOUND
    }

    def serverError() {
        render view: '/error', status: HttpStatus.INTERNAL_SERVER_ERROR
    }
}
