import streamlit as st
import pandas as pd
import numpy as np

x = st.number_input("Masukan Nilai Xi")
y = st.number_input("Masukan Nilai Xf")
i = st.number_input("Masukan Nilai Iterasi")

if st.button('Click Here'):
     st.write('Why hello there')
else:
     st.write('Goodbye')
     
data = {["ddd", "fds", "gvd"], ["dvds","vv","dvs"]}
df = pd.DataFrame(
    list.data,
    columns=('col %d' % i for i in range(20)))

st.dataframe(df.style.highlight_max(axis=0))

st.dataframe(df) 
st.dataframe(df, 200, 100)