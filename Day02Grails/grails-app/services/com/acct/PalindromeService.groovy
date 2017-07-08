package com.acct

import grails.transaction.Transactional


//HERE's WHERE you WRITE LOGIC
//ACCESS DB from HERE
//USE FEATURES LIKE SECURITY, TRANSACTION HERE

@Transactional
class PalindromeService {

    def check(word) {
		word == word.reverse()
    }
}
