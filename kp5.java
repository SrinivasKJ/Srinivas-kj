#!/bin/bash
Case $1 in
Mon)echo “copy a file‖”
Cp file1 file2
;;
tue)echo “rename a file‖”
mv file1 file2
;;
wed)echo “backup a file‖”
mv file1 file2
;;
Thu|fri)echo “remove a file‖”
rm file1*
;;
Sat|sun)echo “create a file‖”
Vi file1
;;
 *)echo “invalid input‖”
 ;;
 Esac

