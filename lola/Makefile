BASE = .
DEST_PATH = .
WORK_SYNCFILES = WD_OntoIOp_current.pdf
PUB_SYNCFILES = 
SYNCDIRS = lib registry syntax use-cases
ALL = $(SYNCFILES)

# We delegate the job of running LaTeX to a specific Makefile
WD_OntoIOp_current.pdf:
	$(MAKE_LATEX) $@

sync-deploy: deploy
	rsync -avzc --delete deploy/. $(DEPLOY_DEST)

.PHONY: WD_OntoIOp_current.pdf sync-deploy

include $(BASE)/Makefile.vars
include $(BASE)/Makefile.in
