BASE = .
SYNCDIRS = lib registry ontology
ALL = 

sync-deploy: deploy
	rsync -avzc --delete deploy/. $(DEPLOY_DEST)

.PHONY: sync-deploy

include $(BASE)/Makefile.vars
include $(BASE)/Makefile.in
