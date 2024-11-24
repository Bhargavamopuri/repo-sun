import numpy as np
import pandas as pd
import random as rd
pd.set_option('max_columns',None)
import os
from sklearn.model_selection import StratifiedShuffleSplit as ss
for dirname, _, filenames in os.walk('/kaggle/input'):
    for filename in filenames:
        print(os.path.join(dirname, filename))