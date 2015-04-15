(ns demo0
  (:use [overtone.live])
  (:require [shadertone.tone :as t]))

(t/start-fullscreen "myApps/plasma.glsl")
(t/start-fullscreen "myApps/blobs.glsl")
(t/start-fullscreen "myApps/noiseSphere.glsl")
p
(demo 6000 (rlpf (saw [80 81]) (+ (* (lf-noise0 0.25) [40 44]) 100)))
(demo 30 (rlpf (saw [120 121]) (+ (* (lf-noise2 0.5) [50 54]) 110)))
(demo 30 (rlpf (saw [120 121]) (+ (* (lf-noise0 1) [60 64]) 30)))
(demo 30 (rlpf (saw [120 121]) (+ (* (lf-noise0 1) [120 18]) 0)))
(demo 30 (rlpf (saw [1200 1210]) (+ (* (lf-noise0 1) [200 220]) 0)))
(demo 30 (rlpf (saw [1200 1210]) (+ (* (lf-noise0 2) [400 420]) 0)))

(stop)
(t/stop)
