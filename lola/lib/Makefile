BASE = ..
PUB_SYNCFILES = dol-inferences-beyond-owl.n3 some-owl-inferences.n3 README
WORK_SYNCFILES = 
SYNCDIRS =

include $(BASE)/Makefile.vars
include $(BASE)/Makefile.in
# include Makefile.in

test: abox-expanded.n3

abox-expanded.n3: abox.n3 some-owl-inferences.n3
	cwm --n3 abox.n3 some-owl-inferences.n3 --think --n3 > $@

.PHONY: test

