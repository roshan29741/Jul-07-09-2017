package com.acct

class AuthFilters {

    def filters = {
        all(controller:'*', action:'*',actionExclude:"index") {
            before = {
				if(!session.loggedIn){
					//	redirect(controller:"authentication")
				}
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
		
    }
}
