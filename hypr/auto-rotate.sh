#!/bin/bash

monitor-sensor | while read -r line; do
echo "$line"
  if echo "$line" | grep -q "orientation changed: normal"; then
    hyprctl keyword monitor ,transform,0
  elif echo "$line" | grep -q "orientation changed: bottom-up"; then
    hyprctl keyword monitor ,transform,2
  elif echo "$line" | grep -q "orientation changed: left-up"; then
    hyprctl keyword monitor ,transform,1
  elif echo "$line" | grep -q "orientation changed: right-up"; then
    hyprctl keyword monitor ,transform,3
  fi
done
