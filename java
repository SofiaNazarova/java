#!/bin/bash
while true
do
test -f /home/jdeadmin/testy/*.xls && for f in /home/jdeadmin/testy/*.xls; do ssconvert "$f" "${f%.xls}.xlsx";
chown www-data:www-data "${f%.xls}.xlsx";
rm -f -- "$f"; done
sleep 10
