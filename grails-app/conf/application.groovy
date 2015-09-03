

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'spring.security.respond.issue.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'spring.security.respond.issue.UserRole'
grails.plugin.springsecurity.authority.className = 'spring.security.respond.issue.Role'
grails.plugin.springsecurity.rejectIfNoRule = false
grails.plugin.springsecurity.securityConfigType = 'Annotation'
grails.plugin.springsecurity.fii.rejectPublicInvocations = false
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	'/':                ['permitAll'],
	'/error':           ['permitAll'],
	'/index':           ['permitAll'],
	'/index.gsp':       ['permitAll'],
	'/shutdown':        ['permitAll'],
	'/assets/**':       ['permitAll'],
	'/**/js/**':        ['permitAll'],
	'/**/css/**':       ['permitAll'],
	'/**/images/**':    ['permitAll'],
	'/**/favicon.ico':  ['permitAll']
]
