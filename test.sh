#!/usr/bin/env bash

function print_welcome {
    echo -e ""
    echo -e "░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░ \"So Doge\""
    echo -e "░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░"
    echo -e "░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░ \"Such Test Cases\""
    echo -e "░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░"
    echo -e "░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░ \"Much Testing\""
    echo -e "░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░"
    echo -e "░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░"
    echo -e "░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░"
    echo -e "░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░"
    echo -e "░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░"
    echo -e "▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░"
    echo -e "▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌"
    echo -e "▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░"
    echo -e "░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░"
    echo -e "░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░"
    echo -e "░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░"
    echo -e "░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░ 1302 TEST CASE RUNNER"
    echo -e "░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░ Spring 2014"
    echo -e "░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░ Developed by Supa' Mike"
    echo -e ""
} # print_welcome

function print_loading {

    n=$(ls testcase.*.in | wc -l)
    step=$((74 / $n))
    sleepstep=$(echo "scale=3; 1.0 / $n" | bc -q)

    echo "Loading Test Cases" [$n found]
    count=0
    until [ $count -ge 74 ]
    do
	printf '%0.s#' `seq $step`
	sleep $sleepstep
	count=`expr $count + $step`
    done
    echo -e "[100%]"
    echo -e ""
} # print_loading

# run the script
print_welcome
print_loading

